import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { WorkoutService } from '../service/workout.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})
export class AppComponent {
  message = '';
  workoutItems: any[] = [];

  constructor(private http: HttpClient, private workoutService: WorkoutService) {}

  ngOnInit() {
    this.getWorkouts();
  }

  callApi() {
    this.http.get('http://localhost:8080/api/workout', { responseType: 'text' })
      .subscribe(msg => this.message = msg);
  }

  getWorkouts() {
    this.workoutService.getWorkoutItems().subscribe(data => {
      this.workoutItems = data;
    });
  }


}
