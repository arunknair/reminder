import { Injectable } from '@angular/core';
import {GoogleRegistrationModel} from '../models/GoogleRegistrationModel';

@Injectable()
export class RootService {

  userData: GoogleRegistrationModel;
  constructor() { }

}
