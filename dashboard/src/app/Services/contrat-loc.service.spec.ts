import { TestBed } from '@angular/core/testing';

import { ContratLocService } from './contrat-loc.service';

describe('ContratLocService', () => {
  let service: ContratLocService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ContratLocService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
