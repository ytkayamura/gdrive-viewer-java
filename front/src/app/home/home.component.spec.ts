import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeComponent } from './home.component';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';

describe('HomeComponent', () => {
  let component: HomeComponent;
  let fixture: ComponentFixture<HomeComponent>;
  let httpMock: HttpTestingController;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      declarations: [HomeComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(HomeComponent);
    component = fixture.componentInstance;
    httpMock = TestBed.inject(HttpTestingController);
  });
  it('should fetch data and update apiData on successful GET', () => {
    const expectedData = [{ id: '1', message: 'Home world!' }];
    component.ngOnInit(); // Trigger component initialization

    const req = httpMock.expectOne('/api/greeting'); // Detect request to specific URL
    expect(req.request.method).toBe('GET');
    req.flush(expectedData); // Respond with mock data

    expect(component.apiData).toEqual([{ id: '1', message: 'Home world!' }]); // Verify component holds the expected data
  });

  afterEach(() => {
    httpMock.verify(); // Ensure that there are no outstanding requests
  });
});
