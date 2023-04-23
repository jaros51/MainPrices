import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ForexComponent } from './forex/forex.component';
import {AgGridModule} from "ag-grid-angular";

@NgModule({
  declarations: [
    AppComponent,
    ForexComponent
  ],
    imports: [
        BrowserModule,
        AgGridModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
