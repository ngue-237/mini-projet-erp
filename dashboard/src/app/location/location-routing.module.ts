import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { EditComponent } from './edit/edit.component';
import { ListComponent } from './list/list.component';

const routes: Routes = [
  { path: '', component: ListComponent },
  { path: 'edit/:id', component: EditComponent },
  { path: 'add', component: AddComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LocationRoutingModule { }
