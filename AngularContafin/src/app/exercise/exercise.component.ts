import { Component } from '@angular/core';
import  {  Router,  ActivatedRoute  }  from  '@angular/router';
import { Exercise } from '../Interfaces/Exercise/exercise.model';
import { ExerciseService } from './exercise.service';

@Component({
  selector: 'exercise',
  templateUrl:
    './exercise.component.html'
})
export class ExerciseComponent {

  idUnit: number;
  idLesson: number;
  idExercise: number;
  idExercises: number[] = new Array();
  exercises: Exercise[] = new Array();

  constructor(private router: Router, activatedRoute: ActivatedRoute, public exerciseService: ExerciseService) {
    let idUnit = activatedRoute.snapshot.params['id'];
    this.idUnit = parseInt(idUnit);
    let idLesson = activatedRoute.snapshot.params['idlesson'];
    this.idLesson = parseInt(idLesson);
    let idExercise = activatedRoute.snapshot.params['idexercise'];
    this.idExercise = parseInt(idExercise);
    this.idExercise = (((this.idUnit-1)*3+this.idLesson)-1)*4+this.idExercise;
    this.idExercises.push(this.idExercise);
    this.idExercises.push(this.idExercise+1);
    this.idExercises.push(this.idExercise+2);
    this.idExercises.push(this.idExercise+3);
    this.getExercises(this.idUnit,this.idLesson,this.idExercise);
    this.getExercises(this.idUnit,this.idLesson,this.idExercise+1);
    this.getExercises(this.idUnit,this.idLesson,this.idExercise+2);
    this.getExercises(this.idUnit,this.idLesson,this.idExercise+3);
  }

  getExercises(idunit: number, idlesson: number, idexercise: number) {
    this.exerciseService.getExercise(idunit, idlesson, idexercise).subscribe(
      nlesson => this.exercises.push(nlesson),
      error => console.log(error)
    )
  }


  pulsar() {
    console.log(this.idUnit);
    console.log(this.idLesson);
    console.log(this.idExercise);
    console.log(this.idExercises);
    console.log(this.exercises);
  }

}
