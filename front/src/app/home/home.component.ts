// home.component.ts
import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';

interface Dict<T> {
  [key: string]: T;
}
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [HttpClientModule],
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
    this.http.get('/api/greeting').subscribe(
      (data) => {
        console.info('Data fetched:', data);
        this.apiData = data as Dict<string>;
      },
      (error) => {
        console.error('Error fetching data:', error);
      }
    );
  }
}
