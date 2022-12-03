import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-user-permission',
  templateUrl: './user-permission.component.html',
  styleUrls: ['./user-permission.component.css']
})
export class UserPermissionComponent implements OnInit {

  options:String[] = [];

  permissionForm: FormGroup;

  role = new FormControl('customer',[Validators.required]);
  user = new FormControl('',[Validators.required]);

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.permissionForm = this.formBuilder.group({
      user: this.user,
      role: this.role
    });
  }


}
