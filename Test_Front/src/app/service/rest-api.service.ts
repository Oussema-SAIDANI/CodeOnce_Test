import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { API_URL } from '../app.constants';

@Injectable({
  providedIn: 'root'
})
export class RestApiService {

  constructor(private http: HttpClient) { }

  public ponctuation(texte){
 // API_URL cest une constante pour faciliter la modification des urls
    return this.http.post<any>(`${API_URL}/ponctuation`, texte);
 }
}
