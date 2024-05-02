import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

interface Dict<T> {
  [key: string]: T;
}
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss',
})
export class HomeComponent {
  apiData: Dict<string>[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchData();
  }

  fetchData() {
    this.http.get('/api/greeting').subscribe({
      next: (data) => {
        console.info('data', data);
        this.apiData = data as Dict<string>[];
      },
    });
  }
}
