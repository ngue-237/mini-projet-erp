import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Vehicule } from 'src/app/Models/vehicule';
import { VehiculeService } from 'src/app/Services/vehicule.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  vehicule =new Vehicule();
  constructor(private vehiculeService:VehiculeService, private router: Router) { }

  ngOnInit(): void {
  }
  update(){
    this.vehiculeService.updatevehicule(this.vehicule.id,this.vehicule).subscribe();}

}
