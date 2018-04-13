import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { UserProfileComponent } from './user/user-profile/user-profile.component';
import { UserConfigurationComponent } from './user/user-configuration/user-configuration.component';
import { UserGoalComponent } from './user/user-goal/user-goal.component';
import { HomeComponent } from './home/home.component';
import { IndexComponent } from './index/index.component';
import { LessonComponent } from './lesson/lesson.component';
import { ExerciseComponent } from './exercise/exercise.component';

const appRoutes = [
  { path: 'login', component: LoginComponent},
  { path: 'User/Profile', component: UserProfileComponent},
  { path: 'User/Configuration', component: UserConfigurationComponent},
  { path: 'User/Goal', component: UserGoalComponent},
  { path: '', component: IndexComponent},
  { path: 'home', component: HomeComponent},
  { path: 'Unit/:id/Lessons', component: LessonComponent },
  { path: 'Unit/:id/Lessons/:idlesson/', component: ExerciseComponent }
];

export const routing = RouterModule.forRoot(appRoutes);