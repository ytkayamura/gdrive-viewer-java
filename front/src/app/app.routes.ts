import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HogeComponent } from './hoge/hoge.component';
export const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'hoge', component: HogeComponent },
];
