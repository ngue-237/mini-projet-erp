import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VehiculeRoutingModule } from './vehicule-routing.module';
import { AddComponent } from './add/add.component';
import { EditComponent } from './edit/edit.component';
import { FormsModule } from '@angular/forms';
import { ListComponent } from './list/list.component';


@NgModule({
  declarations: [
    AddComponent,
    EditComponent,
    ListComponent
  ],
  imports: [
    CommonModule,
    VehiculeRoutingModule,
    FormsModule
  ]
})
export class VehiculeModule { }
