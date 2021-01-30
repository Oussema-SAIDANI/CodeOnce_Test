import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators  } from '@angular/forms';
import { Router, ActivatedRoute} from '@angular/router';
import { RestApiService } from '../service/rest-api.service';


@Component({
  selector: 'app-ponctuation',
  templateUrl: './ponctuation.component.html',
  styleUrls: ['./ponctuation.component.css']
})
export class PonctuationComponent implements OnInit {
    PoncForm: FormGroup;
    textPonc='';
    nombre:number;
  constructor(private route: Router,private fb: FormBuilder, private service: RestApiService) { 
    this.PoncForm = this.fb.group({
      texte: ['', Validators.required] 
    });
  }

  ngOnInit() {
  }
  ponctuation(): void {
    this.service.ponctuation(this.textPonc).subscribe( response => {
      console.log(response)
     this.nombre = response
      });
  }
}
