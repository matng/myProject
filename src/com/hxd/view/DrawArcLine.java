package com.hxd.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.QuadCurveTo;

public class DrawArcLine extends AnchorPane {
	private HBox hBox;
	private Button btn;
	public void Initialize()
	{
		hBox = new HBox();
		this.getChildren().add(hBox);
		//btn = new Button();
		//btn.setText("画曲线");
//		//btn.setPadding(new Insets(100.0));
//		btn.setOnAction(new EventHandler<ActionEvent>() { 
//			@Override 
//			public void handle(ActionEvent e) 
//			{ 
//				//asdasdasd
//			} 
//		});
//		
//		//sadasds
		//vBox.getChildren().add(btn);
      //绘制贝塞尔曲线
	
//	  Path path = new Path();
//	  //path.set
//	  MoveTo moveTo = new MoveTo(50,100);
//      CubicCurveTo cubicCurveTo = new CubicCurveTo(75,75,100,125,125,100);
//      
//      MoveTo moveTo1 = new MoveTo(125,100);
//      
//      CubicCurveTo cubicCurveTo1 = new CubicCurveTo(150,75,175,100,200,100);
//      
//      path.setStroke(Color.BLACK); 
//      path.setStrokeWidth(3); 
//      path.setFill(Color.WHITE);
//      
//      path.getElements().addAll(moveTo, cubicCurveTo, cubicCurveTo1);
//      
//      hBox.getChildren().add(path);
//      
//      QuadCurve quadCurve = new QuadCurve(50,100,75,75,100,100);
//      quadCurve.setStroke(Color.BLACK); 
//      quadCurve.setStrokeWidth(3); 
//      quadCurve.setFill(Color.WHITE);
//      
//      vBox.getChildren().add(quadCurve);
      
      List<Point> pointList = new ArrayList<Point>();
      
      
      Point point = new Point(100,100);
      for (Point pt1 = point;pt1.x < 721; pt1.x += 50, pt1.y += 50)
      {
    	  Point pt = new Point(pt1.x,pt1.y);
    	  pointList.add(pt);
      }
      
	  Path path = new Path();
	  path.setStroke(Color.BLACK); 
	  path.setStrokeWidth(3); 
	  path.setFill(Color.WHITE);
	  //path.set
	  MoveTo moveTo = new MoveTo(50,50);
	  
	  path.getElements().add(moveTo);
      
      for (int i=0; i < pointList.size();++i)
      {
    	  Point pt1 = pointList.get(i);
	      //CubicCurveTo cubicCurveTo = new CubicCurveTo(pt1.x-50,pt1.y-100,pt1.x-50,pt1.y,pt1.x,pt1.y); //75,75,100,125,125,100)
	      //path.getElements().add(cubicCurveTo);
	      
    	  if (i%2 == 0)
    	  {
    	      QuadCurveTo quadCurveTo = new QuadCurveTo(pt1.x,pt1.y-50,pt1.x,pt1.y);
    	      path.getElements().add(quadCurveTo);
    	  }
    	  else
    	  {
    	      QuadCurveTo quadCurveTo = new QuadCurveTo(pt1.x-50,pt1.y,pt1.x,pt1.y);
    	      path.getElements().add(quadCurveTo);
    	  }
      }
      
      hBox.getChildren().add(path);
	}
	
	private void randomSet(int min, int max, int n, HashSet<Integer> set)
	{
	       if (n > (max - min + 1) || max < min) {  
	           return;  
	       }  
	       for (int i = 0; i < n; i++) {  
	           // 调用Math.random()方法  
	           int num = (int) (Math.random() * (max - min)) + min;  
	           set.add(num);// 将不同的数存入HashSet中  
	       }  
	       int setSize = set.size();  
	       // 如果存入的数小于指定生成的个数，则调用递归再生成剩余个数的随机数，如此循环，直到达到指定大小  
	       if (setSize < n) {  
	        randomSet(min, max, n - setSize, set);// 递归  
	       }  
	}
	
	private class Point {
		private int x;
		private int y;
		
		Point()
		{
			this.x=0;
			this.y=0;
		}
		
		Point(int x,int y)
		{
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
	}
}
