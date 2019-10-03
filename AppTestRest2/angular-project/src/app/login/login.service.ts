import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import {LoginModel} from '../models/LoginModel';
import {environment} from '../../environments/environment';
import {NGXLogger} from 'ngx-logger';

@Injectable()
export class LoginService {

  constructor(private http: HttpClient,
              private log: NGXLogger) { }

  loginUser(msg: LoginModel) {
    const url  = environment.baseUrl + '/rest/msg/employee-details';
    this.log.debug('URL : ' + url);
    this.log.debug('MSG : ' + JSON.stringify(msg));
    const headers = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };

    this.http.post(url, JSON.stringify(msg), headers).subscribe(resp => {
      this.log.debug('got result');
      this.log.debug(resp);
      const data = <LoginModel>resp;
      this.log.debug('######################');
      this.log.debug(data.username);
      this.log.debug(data.password);
    });
  }

  getUsers() {
    const url = 'http://localhost:8080/getAll';
    this.log.debug('URL : ' + url);
    const headers = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    this.http.get(url).subscribe(resp => {
      this.log.debug('got result');
      this.log.debug(resp);
    });
  }

  springLoginUser(msg: LoginModel) {
    const url = 'http://localhost:8080/login';
    const headers = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    this.http.get(url, {params: new HttpParams({fromObject:{params: JSON.stringify(msg)}})}).subscribe(resp => {
      this.log.debug('got result');
      this.log.debug(resp);
    });
  }
}
