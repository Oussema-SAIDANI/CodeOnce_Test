import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule,ReactiveFormsModule } from "@angular/forms";

import { AppComponent } from "./app.component";
import { PonctuationComponent } from "./Ponctuation/ponctuation.component";
import { Routes, RouterModule } from "@angular/router";
import { RestApiService } from './service/rest-api.service';
import { HttpClientModule } from '@angular/common/http';
import { MenuComponent } from './menu/menu.component';


const routes: Routes = [
  { path: '', component: PonctuationComponent },
  
];

@NgModule({
  declarations: [
    AppComponent,
    PonctuationComponent,
    MenuComponent,

  ],
  imports: [BrowserModule,
    RouterModule.forRoot(routes),
    FormsModule,
    ReactiveFormsModule,
     HttpClientModule
    ],
  providers: [   
        RestApiService,    
        ],
  bootstrap: [AppComponent],
})
export class AppModule {}
