// home.component.ts
import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { FlexLayoutModule } from '@angular/flex-layout';

interface Dict<T> {
  [key: string]: T;
}
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [HttpClientModule, FlexLayoutModule],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
  apiData: Dict<string> = {};

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchData();
  }

  fetchData() {
    this.http.get('/api/greeting').subscribe({
      next: (data) => {
        console.info('Data fetched:', data);
        this.apiData = data as Dict<string>;
      },
      error: (error) => {
        console.error('Error fetching data:', error);
      },
    });
  }
}
