import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InitPageComponent } from './init-page.component';
import {CustomMaterialModule} from '../custom-material/custom-material.module';
import {RouterModule} from '@angular/router';

@NgModule({
  imports: [
    CommonModule,
    CustomMaterialModule,
    RouterModule
  ],
  declarations: [InitPageComponent]
})
export class InitPageModule { }
