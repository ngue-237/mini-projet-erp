import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LocationRoutingModule } from './location-routing.module';
import { EditComponent } from './edit/edit.component';
import { AddComponent } from './add/add.component';
import { ListComponent } from './list/list.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    EditComponent,
    AddComponent,
    ListComponent
  ],
  imports: [
    CommonModule,
    LocationRoutingModule,
    FormsModule,
    HttpClientModule
  ]
})
export class LocationModule { }
