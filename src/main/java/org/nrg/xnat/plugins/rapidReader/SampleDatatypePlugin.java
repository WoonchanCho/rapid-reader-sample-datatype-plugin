/*
 * radreport-datatype-plugin: org.nrg.xnat.radreports.plugin.RadReportDatatypePlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2016, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.plugins.rapidReader;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.bean.RadInternal000Bean;

@XnatPlugin(value = "sampleDatatypePlugin", name = "Rapid Reader Sample Datatype Plugin", dataModels = {
        @XnatDataModel(value = RadInternal000Bean.SCHEMA_ELEMENT_NAME, singular = "Internal Data", plural = "Internal Data") })
public class SampleDatatypePlugin {
    // [*L*] //
}
