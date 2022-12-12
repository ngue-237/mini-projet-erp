import { Component, OnInit } from '@angular/core';
import { Vehicule } from 'src/app/Models/vehicule';
import { VehiculeService } from 'src/app/Services/vehicule.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  vehicules: Vehicule[]=[];
  constructor(private vehiculeService: VehiculeService) { }

  ngOnInit(): void {
    this.vehiculeService.getVehicules().subscribe((data: Vehicule[]) => {
      console.log(data);
      this.vehicules = data;
    });
  }
  delete(id:number){
    console.log("test");
    this.vehiculeService.deletevehicule(id).subscribe();
   }

}
