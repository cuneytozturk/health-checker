import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WorkoutService {

  private apiUrl = 'http://localhost:8080/api/workout';

  constructor(private http: HttpClient) { }

  getWorkoutItems(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }
}
