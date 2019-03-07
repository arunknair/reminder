import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {LoginModule} from './login/login.module';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {AppRoutingModule} from './app-routing.module';
import {CommonModule} from '@angular/common';
import {InitPageModule} from './init-page/init-page.module';
import {RegisterUserModule} from './register-user/register-user.module';
import {AuthServiceConfig, SocialLoginModule} from 'angular-6-social-login';
import {getAuthServiceConfigs} from '../socialloginConfig';
import {HomeModule} from './home/home.module';
import {RootService} from './common/root.service';
import {HttpClientModule} from '@angular/common/http';
import {LoggerModule, NgxLoggerLevel} from 'ngx-logger';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    CommonModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    InitPageModule,
    LoginModule,
    RegisterUserModule,
    SocialLoginModule,
    HomeModule,
    HttpClientModule,
    LoggerModule.forRoot(
      { serverLoggingUrl: '/api/logs', level: NgxLoggerLevel.DEBUG, serverLogLevel: NgxLoggerLevel.ERROR}
      )
  ],
  providers: [
    {
      provide: AuthServiceConfig,
      useFactory: getAuthServiceConfigs
    },
    RootService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
