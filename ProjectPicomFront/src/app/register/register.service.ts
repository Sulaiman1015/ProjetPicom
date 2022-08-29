import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

interface RegistForm {
  firstName: string;
  lastName: string;
  email: string;
  password: string;
}

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private http: HttpClient) { }

  register(registForm: RegistForm) {
    return this.http.post('http://localhost:8080/inscription', registForm)
  }
}
