import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RegisterUserComponent } from './register-user.component';
import {SocialLoginModule} from 'angular5-social-login';
import {getAuthServiceConfigs} from '../../socialloginConfig';

@NgModule({
  imports: [
    CommonModule,
    SocialLoginModule
  ],
  providers: [
  ],
  declarations: [RegisterUserComponent]
})
export class RegisterUserModule { }
