/**
 * mycollab-reporting - Parent pom providing dependency and plugin management for applications
		built with Maven
 * Copyright © ${project.inceptionYear} MyCollab (support@mycollab.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.reporting;

import net.sf.dynamicreports.jasper.builder.export.JasperCsvExporterBuilder;
import net.sf.dynamicreports.report.exception.DRException;

import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.export;

/**
 * @author MyCollab Ltd
 * @since 5.4.7
 */
public class CsvReportBuilder extends AbstractReportBuilder {

    CsvReportBuilder(String reportTitle, Locale locale, RpFieldsBuilder fieldBuilder,
                     Class classType, Map parameters) {
        super(reportTitle, locale, fieldBuilder, classType, parameters);
    }

    @Override
    protected void initReport() {
    }

    @Override
    protected void setTitle(String title) {
        reportBuilder.title(cmp.horizontalList());
    }

    @Override
    public void toStream(OutputStream outputStream) throws DRException {
        reportBuilder.ignorePageWidth();
        reportBuilder.ignorePagination();
        JasperCsvExporterBuilder csvExporter = export.csvExporter(outputStream);
        reportBuilder.toCsv(csvExporter);
    }
}
