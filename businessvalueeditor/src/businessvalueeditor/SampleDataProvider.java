/*
* Licensed Materials - Property of IBM
* 5725-B69 5655-Y17 5724-Y00 5724-Y17 5655-V84
* Copyright IBM Corp. 1987, 2018. All Rights Reserved.
*
* Note to U.S. Government Users Restricted Rights: 
* Use, duplication or disclosure restricted by GSA ADP Schedule 
* Contract with IBM Corp.
*/

package businessvalueeditor;

import ilog.rules.vocabulary.model.bom.IlrBOMVocabulary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Data provider class for the sample: defines the data to be shown and their description
 */
public class SampleDataProvider  {
	
	/*final static String[] dataInfos = {
		"Alabama",
		"Alaska",
		"Arizona",
		"Arkansas",
		"California",
		"Colorado",
		"Connecticut",
		"Delaware",
		"Florida",
		"Georgia",
		"Hawaii",
		"Idaho",
		"IllinoisIndiana",
		"Iowa",
		"Kansas",
		"Kentucky",
		"Louisiana",
		"Maine",
		"Maryland",
		"Minnesota",
		"Mississippi",
		"Missouri",
		"MontanaNebraska",
		"Nevada",
		"New_Hampshire",
		"New_Jersey",
		"New_Mexico",
		"New_York",
		"North_Carolina",
		"North_Dakota",
		"Ohio",
		"Oklahoma",
		"Oregon",
		"PennsylvaniaRhode_Island",
		"South_Carolina",
		"South_Dakota",
		"Tennessee",
		"Texas",
		"Utah",
		"Vermont",
		"Virginia",
		"Washington",
		"West_Virginia",
		"Wisconsin",
		"Wyoming"
}; */
    final static String[][] dataInfos = new String[][] {
    	{"Alabama", "Alabama_Share_The_Wonder"},
    	{"Alaska", "Alaska_Within_Your_Reach"},
    	{"Arizona", "Arizona_The_Grand_Canyon_State"},
    	{"Arkansas", "Arkansas_The_Natural_State"},
    	{"California", "California_Find_Yourself_Here_The_Golden_State_Eureka!"},
    	{"Colorado", "Colorado_The_Centennial_State"},
    	{"Connecticut", "Connecticut_Full_of_Surprises"}
    	/*{"Alabama"},
    	{"Alaska"},
    	{"Arizona"},
    	{"Arkansas"},
    	{"California"},
    	{"Colorado"},
    	{"Connecticut"},
    	{"Delaware"},
    	{"Florida"},
    	{"Georgia"},
    	{"Hawaii"},
    	{"Idaho"},
    	{"IllinoisIndiana"},
    	{"Iowa"},
    	{"Kansas"},
    	{"Kentucky"},
    	{"Louisiana"},
    	{"Maine"},
    	{"Maryland"},
    	{"Minnesota"},
    	{"Mississippi"},
    	{"Missouri"},
    	{"MontanaNebraska"},
    	{"Nevada"},
    	{"New_Hampshire"},
    	{"New_Jersey"},
    	{"New_Mexico"},
    	{"New_York"},
    	{"North_Carolina"},
    	{"North_Dakota"},
    	{"Ohio"},
    	{"Oklahoma"},
    	{"Oregon"},
    	{"PennsylvaniaRhode_Island"},
    	{"South_Carolina"},
    	{"South_Dakota"},
    	{"Tennessee"},
    	{"Texas"},
    	{"Utah"},
    	{"Vermont"},
    	{"Virginia"},
    	{"Washington"},
    	{"West_Virginia"},
    	{"Wisconsin"},
    	{"Wyoming"}*/

    	

    	
           /* {"XSDFFSG", "Invitation for annual special event"},
            {"ZEREZRE", "Tickets for the opera"} */
   };

    public int getCount() {
	return dataInfos.length;
    }
    public String getValue(int i) {
	if (i >=0 && i < getCount())
	    return dataInfos[i][0];
	return "";
    }
    public String getDescription(int i) {
	if (i >=0 && i < getCount())
	    return dataInfos[i][1];
	return "";
    } 
}
