import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {InitPageComponent} from './init-page/init-page.component';
import {RegisterUserComponent} from './register-user/register-user.component';
import {HomeComponent} from './home/home.component';


const routes: Routes = [
  {
    path: '',
    component: InitPageComponent,
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'sign-up',
    component: RegisterUserComponent
  },
  {
    path: 'home',
    component: HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

