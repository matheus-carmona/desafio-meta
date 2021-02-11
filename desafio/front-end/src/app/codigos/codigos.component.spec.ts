import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CodigosComponent } from './codigos.component';

describe('CodigosComponent', () => {
  let component: CodigosComponent;
  let fixture: ComponentFixture<CodigosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CodigosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CodigosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
