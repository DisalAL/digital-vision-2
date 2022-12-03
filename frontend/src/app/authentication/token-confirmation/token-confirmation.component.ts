import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-token-confirmation',
  templateUrl: './token-confirmation.component.html',
  styleUrls: ['./token-confirmation.component.css']
})
export class TokenConfirmationComponent implements OnInit {

  tokenConfirmationForm: FormGroup;

  token = new FormControl('',[Validators.required]);

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.tokenConfirmationForm = this.formBuilder.group({
      token: this.token
    });
  }

}
