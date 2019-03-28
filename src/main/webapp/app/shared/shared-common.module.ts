import { NgModule } from '@angular/core';

import { CapacityPlanningSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [CapacityPlanningSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [CapacityPlanningSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class CapacityPlanningSharedCommonModule {}
