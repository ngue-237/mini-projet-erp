import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddContratComponent } from './add-contrat/add-contrat.component';
import { AddComponent } from './add/add.component';
import { EditContratComponent } from './edit-contrat/edit-contrat.component';
import { EditComponent } from './edit/edit.component';
import { ListContratComponent } from './list-contrat/list-contrat.component';
import { ListComponent } from './list/list.component';

const routes: Routes = [
  { path: 'client', component: ListComponent },
  { path: 'client/edit/:id', component: EditComponent },
  { path: 'contrat', component: ListContratComponent },
  { path: 'client/add', component: AddComponent },
  { path: 'contrat/add', component: AddContratComponent },
  { path: 'contrat/edit/:id', component: EditContratComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LocationRoutingModule { }
