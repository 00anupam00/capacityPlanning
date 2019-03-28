import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'jhi-feature',
  templateUrl: './feature.component.html',
  styles: []
})
export class FeatureComponent implements OnInit {

  constructor(
    public ingestion?: string,
    public globalSearch?: string,
    public catalog?: string,
    public dq?: string,
    public workflows?: string,
    public transformation?: string
  ) {
    this.ingestion = ingestion ? ingestion : null,
    this.globalSearch = globalSearch ? globalSearch : null,
    this.catalog = catalog ? catalog : null,
    this.dq = dq ? dq : null,
    this.workflows = workflows ? workflows : null,
    this.transformation = transformation ? transformation : null
  }

  ngOnInit() {
  }

}
