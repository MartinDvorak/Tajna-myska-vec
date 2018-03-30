package tests;

import Planimetry.Circle.Middle;
import Planimetry.Circle.Move;
import Planimetry.Circle.Scale;
import Planimetry.Circle.Size;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.SortedMap;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class HW2_tests {


    @Test
    public void test01()
    {
        SortedMap<String, Double> point = new TreeMap<>();
        point.put("pointX", 1.0);
        point.put("pointY", 1.0);

        Move move1 = new Move(point, 2.0, 2.0, 2.0);
        move1.execute();
        SortedMap<String, Double> result = move1.getValue();
        Assert.assertEquals("Test presunuti kruhu1",(Double)3.0, (Double)result.get("pointX"));
        Assert.assertEquals("Test presunuti kruhu1",(Double)3.0 ,(Double)result.get("pointY"));

        Scale scale1 = new Scale(point, 4.0, 10.0);
        scale1.execute();
        result = scale1.getValue();
        Assert.assertEquals("Test zmeny velikosti kruhu1",(Double)40.0, (Double)result.get("radius"));
    }

    @Test
    public void test02()
    {
        SortedMap<String, Double> circle = new TreeMap<>();
        circle.put("pointX", 1.0);
        circle.put("pointY", 1.0);
        circle.put("radius", 5.0);

        Move move2 = new Move(circle, 4.0, 2.5);
        move2.execute();
        SortedMap<String, Double> result = move2.getValue();
        Assert.assertEquals("Test presunuti kruhu2",(Double)5.0, (Double)result.get("pointX"));
        Assert.assertEquals("Test presunuti kruhu2",(Double)3.5 ,(Double)result.get("pointY"));

        Scale scale2 = new Scale(circle, 10.0);
        scale2.execute();
        result = scale2.getValue();
        Assert.assertEquals("Test zmeny velikosti kruhu2",(Double)50.0, (Double)result.get("radius"));
    }


    @Test
    public void test03()
    {
        SortedMap<String, Double> circle = new TreeMap<>();
        circle.put("pointX", 5.0);
        circle.put("pointY", 8.0);
        circle.put("radius", 20.0);

        Middle mid1 = new Middle(circle);
        mid1.execute();
        SortedMap<String, Double> result = mid1.getValue();
        Assert.assertEquals("Test ziskani stredu1",(Double)5.0, (Double)result.get("pointX"));
        Assert.assertEquals("Test ziskani stredu1",(Double)8.0, (Double)result.get("pointY"));

        Size size1 = new Size(circle);
        size1.execute();
        result = size1.getValue();
        Assert.assertEquals("Test ziskani velikosti1",(Double)20.0, (Double)result.get("scalar"));
    }

    @Test
    public void test04(){

        SortedMap<String, Double> point = new TreeMap<>();
        point.put("pointX", 4.5);
        point.put("pointY", 12.0);

        Middle mid2 = new Middle(point, 15.0);
        mid2.execute();
        SortedMap<String, Double> result = mid2.getValue();
        Assert.assertEquals("Test ziskani stredu2",(Double)4.5, (Double)result.get("pointX"));
        Assert.assertEquals("Test ziskani stredu2",(Double)12.0, (Double)result.get("pointY"));

        Size size2 = new Size(point, 24.95);
        size2.execute();
        result = size2.getValue();
        Assert.assertEquals("Test ziskani velikosti2",(Double)24.95, (Double)result.get("scalar"));
    }


}
