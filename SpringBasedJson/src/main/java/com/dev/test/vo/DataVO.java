package com.dev.test.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.io.Serializable;

import org.neo4j.cypher.internal.compiler.v2_1.planner.logical.steps.argumentLeafPlanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.libs.com.zwitserloot.cmdreader.FullName;

@Getter
@Setter
public class DataVO extends AbstractObject {
	private static final long serialVersionUID = 5549389359640166088L;
	private List<Data> data = new ArrayList<DataVO.Data>();

	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Data extends AbstractObject {

		private static final long serialVersionUID = -2174159619472223523L;
		private String ChartTitle;
		private String A;
		private String B;
		private String C;
		private String D;
	}

}

// renderer.setChartTitle(data.getChartTitle());
// renderer.setXTitle(data.getxTitle());
// renderer.setYTitle(data.getYTitle());
// renderer.setXAxisMin(Double.parseDouble(data.getXAxisMin()));
// renderer.setXAxisMax(Double.parseDouble(data.getXAxisMax()));
// renderer.setYAxisMin(Double.parseDouble(data.getYAxisMin()));
// renderer.setYAxisMax(Double.parseDouble(data.getYAxisMax()));
// renderer.setAxesColor(data.getAxesColor());
// renderer.setLabelsColor(data.getLabelsColor());

// private String xTitle;
// private String yTitle;
// private List<Double> xValue;
// private List<Double> yValue;
// private String chartTitle;
// private String XTitle;
// private String YTitle;
// private String XAxisMin;
// private String XAxisMax;
// private String YAxisMin;
// private String YAxisMax;
// private int axesColor;
// private int labelsColor;
// private String xLabels;
// private String yLabels;
// private SortedMap<String, String> xTextLabel;
// private SortedMap<String, String> yTextLabel;