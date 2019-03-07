import {Component, OnInit} from '@angular/core';
import {AuthService, GoogleLoginProvider} from 'angular-6-social-login';
import {GoogleRegistrationModel} from '../models/GoogleRegistrationModel';
import {RootService} from '../common/root.service';
import {Router} from '@angular/router';
import {NGXLogger} from 'ngx-logger';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  constructor(public socialAuthService: AuthService,
              public rootService: RootService,
              public route: Router,
              private log: NGXLogger) {
  }

  ngOnInit() {
  }

  public socialSignIn(socialPlatform: string) {
    let socialPlatformProvider;
    if (socialPlatform === 'google') {
      socialPlatformProvider = GoogleLoginProvider.PROVIDER_ID;
    }

    this.socialAuthService.signIn(socialPlatformProvider)
      .then((userData) => {
          const registrationData = <GoogleRegistrationModel>userData;
        this.log.debug('registrationData##########');
        this.log.debug(registrationData);
          this.rootService.userData = registrationData;
          this.route.navigate(['home']);
        }
      )
      .catch((error) => {
        this.log.debug('error##########');
        this.log.debug(error);
      });
  }

}
