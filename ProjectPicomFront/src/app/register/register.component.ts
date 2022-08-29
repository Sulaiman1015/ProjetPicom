import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl, Validator, Validators} from '@angular/forms';
import { RegisterService} from "./register.service";
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registForm!: FormGroup;

  constructor(private registerService: RegisterService) { }

  ngOnInit(): void {
    this.registForm = new FormGroup({
      firstName: new FormControl('', Validators.pattern('/^[0-9a-zA-Z]{2,9}$/')),
      lastName: new FormControl('', Validators.pattern('/^[0-9a-zA-Z]{2,9}$/')),
      email: new FormControl('', Validators.pattern('/^[a-z0-9._%+-]+@orsys.fr$/')),
      password: new FormControl('', Validators.pattern('[0-9a-zA-Z]{2,8}')),
    })
  }

  registSubmit() {
    const { firstName, lastName, email, password} = this.registForm.value
    const registParams = { firstName, lastName, email, password}
  }

}
