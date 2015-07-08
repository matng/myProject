package com.hxd.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class MyCanvas extends Canvas {
	private GraphicsContext gc;  
    public MyCanvas(double width, double height){  
        super(width, height);  
          
        gc = getGraphicsContext2D(); 
        draw(gc);  
    }  
      
    public void draw(GraphicsContext gc){  
      
//        gc.save();  
//        gc.setStroke(Color.BLUE);  
//        gc.setLineWidth(2);                //�����ߵĿ��  
//        gc.strokeLine(0, 0, 50, 50);       //����ֱ��  
//        gc.restore();  
//          
//        //������Բ  
//        gc.save();  
//        gc.setFill(Color.YELLOWGREEN);  
//        gc.strokeOval(0, 80, 50, 50);  
//        gc.fillOval(100, 80, 50, 50);  
//        gc.restore();  
//          
//        //���ƾ���  
//        gc.save();  
//        gc.setStroke(Color.CHOCOLATE);  
//        gc.fillRect(0, 150, 50, 50);  
//        gc.strokeRect(100, 150, 50, 50);  
//        gc.restore();  
//          
//        //����Բ�Ǿ���  
//        gc.save();  
//        gc.setFill(Color.CHOCOLATE);  
//        gc.fillRoundRect(0, 220, 50, 50, 15, 15);  
//        gc.strokeRoundRect(100, 220, 50, 50, 15, 15);  
//        gc.restore();  
//          
//        //��������  
//        gc.save();  
//        gc.setStroke(Color.CHOCOLATE);  
//        gc.fillArc(10, 300, 30, 30, 40, 280, ArcType.OPEN);  
//        gc.fillArc(60, 300, 30, 30, 40, 280, ArcType.CHORD);  
//        gc.fillArc(110, 300, 30, 30, 40, 280, ArcType.ROUND);  
//        gc.strokeArc(10, 340, 30, 30, 40, 280, ArcType.OPEN);  
//        gc.strokeArc(60, 340, 30, 30, 40, 280, ArcType.CHORD);  
//        gc.strokeArc(110, 340, 30, 30, 40, 280, ArcType.ROUND);  
//        gc.restore();  
//          
//        //���ƶ����  
//        gc.save();  
//        gc.setFill(Color.RED);  
//        gc.setStroke(Color.CHOCOLATE);  
//        gc.fillPolygon(new double[]{0, 40, 50, 60, 100, 70, 85, 50, 15, 30}, new double[]{440,440,400,440,440,  460,500,470,500,460}, 10);  
//        gc.strokePolygon(new double[]{0, 40, 50, 60, 100, 70, 85, 50, 15, 30}, new double[]{440,440,400,440,440,  460,500,470,500,460}, 10);  
//        gc.restore();
        
	      //���Ʊ���������
	      gc.save();
	      gc.setStroke(Color.BLUE);
	      gc.setLineWidth(2);
	      CubicCurve cubic = new CubicCurve(50,50,75,25,100,75,125,50);
    }
}
