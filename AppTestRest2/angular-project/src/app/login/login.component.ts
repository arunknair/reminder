import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {LoginService} from './login.service';
import {LoginModel} from '../models/LoginModel';
import {NGXLogger} from 'ngx-logger';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  username: FormControl;
  password: FormControl;

  constructor(private loginService: LoginService,
              private log: NGXLogger) {
    this.username = new FormControl();
    this.password = new FormControl();
    this.loginForm = new FormGroup({
      username: this.username,
      password: this.password
    });
  }

  ngOnInit() {
  }

  loginUser() {
    this.log.debug(this.username.value)
    this.log.debug(this.password.value);
    const msg = new  LoginModel();
    msg.username = this.username.value;
    msg.password = this.password.value;
    this.loginService.loginUser(msg);
  }

  userList() {
    this.loginService.getUsers();
  }
}
