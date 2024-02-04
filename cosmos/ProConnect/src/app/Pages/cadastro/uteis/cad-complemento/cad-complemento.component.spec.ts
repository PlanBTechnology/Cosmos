import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadComplementoComponent } from './cad-complemento.component';

describe('CadComplementoComponent', () => {
  let component: CadComplementoComponent;
  let fixture: ComponentFixture<CadComplementoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CadComplementoComponent]
    });
    fixture = TestBed.createComponent(CadComplementoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
