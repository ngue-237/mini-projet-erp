import { Component, OnInit } from '@angular/core';
import { ContratLoc } from 'src/app/Models/contrat-loc';
import { ContratService } from 'src/app/Services/contrat.service';

@Component({
  selector: 'app-list-contrat',
  templateUrl: './list-contrat.component.html',
  styleUrls: ['./list-contrat.component.css']
})
export class ListContratComponent implements OnInit {

  contrats: ContratLoc[]=[];
  constructor(private contratService: ContratService) { }

  ngOnInit(): void {
    this.contratService.getContrats().subscribe((data: ContratLoc[]) => {
      console.log(data);
      this.contrats = data;
    });
  }
  delete(ref:any){
    console.log("test");
    this.contratService.delete(ref).subscribe();
   }
}
