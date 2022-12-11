import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ContratLoc } from 'src/app/Models/contrat-loc';
import { ContratService } from 'src/app/Services/contrat.service';

@Component({
  selector: 'app-edit-contrat',
  templateUrl: './edit-contrat.component.html',
  styleUrls: ['./edit-contrat.component.css']
})
export class EditContratComponent implements OnInit {

  contrat =new ContratLoc();
  constructor(private contratService:ContratService, private router: Router) { }

  ngOnInit(): void {
  }
  update(){
    this.contratService.update(this.contrat.ref,this.contrat).subscribe(res => {
      //this.toastr.success('Employe a été ajouter','Ajout')
    console.log('contrat created!');
    this.router.navigateByUrl('/gestion-location/contrat');});
  }
}
