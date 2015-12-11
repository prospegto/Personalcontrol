package es.iesnervion.android.android.controlpersonal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

public class ExtendedEditText extends EditText {
	
	private Paint p1;
	private Paint p2;
	private float escalaPantalla;
	
	public ExtendedEditText(Context context, AttributeSet attrs, int defStyle){
		super(context, attrs, defStyle);
		
		inicializacion();
	}
	
	public ExtendedEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
		inicializacion();
	}
	
	public ExtendedEditText(Context context) {
		super(context);	
		inicializacion();
	}
	
	private void inicializacion()
	{
		p1 = new Paint(Paint.ANTI_ALIAS_FLAG);
		p1.setColor(Color.CYAN);
		
		p2 = new Paint(Paint.ANTI_ALIAS_FLAG);
		p2.setColor(Color.RED);
		p2.setTextSize(22);
		
		escalaPantalla = getResources().getDisplayMetrics().density;
	}
	
	@Override
	public void onDraw(Canvas canvas) 
	{
		super.onDraw(canvas);
		canvas.drawRect(this.getWidth()-30*escalaPantalla, 5*escalaPantalla, this.getWidth()-5*escalaPantalla, 20*escalaPantalla, p1) ;
		canvas.drawText("" + this.getText().toString().length(), this.getWidth()-28*escalaPantalla, 17*escalaPantalla, p2);	
	}
}
