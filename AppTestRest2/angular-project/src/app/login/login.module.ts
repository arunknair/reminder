import { NgModule } from '@angular/core';
import { LoginComponent } from './login.component';
import {CustomMaterialModule} from '../custom-material/custom-material.module';
import {ReactiveFormsModule} from '@angular/forms';
import {LoginService} from './login.service';

@NgModule({
  imports: [
    CustomMaterialModule,
    ReactiveFormsModule
  ],
  declarations: [LoginComponent],
  providers: [
    LoginService
  ]
})
export class LoginModule { }
