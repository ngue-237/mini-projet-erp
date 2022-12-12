import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LocationRoutingModule } from './location-routing.module';
import { EditComponent } from './edit/edit.component';
import { AddComponent } from './add/add.component';
import { ListComponent } from './list/list.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AddContratComponent } from './add-contrat/add-contrat.component';
import { EditContratComponent } from './edit-contrat/edit-contrat.component';
import { ListContratComponent } from './list-contrat/list-contrat.component';


@NgModule({
  declarations: [
    EditComponent,
    AddComponent,
    ListComponent,
    ListContratComponent,
    AddContratComponent,
    EditContratComponent
  ],
  imports: [
    CommonModule,
    LocationRoutingModule,
    FormsModule,
    HttpClientModule
  ]
})
export class LocationModule { }
