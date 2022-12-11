import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ContratLoc } from 'src/app/Models/contrat-loc';
import { ContratService } from 'src/app/Services/contrat.service';

@Component({
  selector: 'app-add-contrat',
  templateUrl: './add-contrat.component.html',
  styleUrls: ['./add-contrat.component.css']
})
export class AddContratComponent implements OnInit {

  contrat = new ContratLoc;
  constructor(private contratService :ContratService, private router: Router) { }

  ngOnInit(): void {
    this.contrat=new ContratLoc();
  }

  save(){
    this.contratService.create(this.contrat).subscribe (res => {
      //this.toastr.success('Employe a été ajouter','Ajout')
    console.log('Contrat created!');
    this.router.navigateByUrl('/gestion-location/contrat');});
  }

}
