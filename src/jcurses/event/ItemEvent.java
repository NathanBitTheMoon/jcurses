package jcurses.event;

import jcurses.widgets.Widget;
/*
*  Instances of this class are generated by widgets, that manage a list of items,
*  an example is list widget.  
**/

public class ItemEvent extends Event {
	
	private int _id=0;
	private Object _item = null; 
	private int _type = 0;
	
	public static final int SELECTED = 0;
	public static final int DESELECTED = 1;
	public static final int CALLED = 2;
	
	
    /*
    *  The constructor
    * 
    * @param source the widget, that has generated this event
    * @param id the id of the affected item
    * @param item the content of the affected item, in order this is a string.
    * @param type the type of the event, must be equal to one of following three constants:
    *       <br><code>SELECTED<code> - the event signals, that an item is selected by the user
    *       <br><code>DESELECTED<code> - the event signals, that an item is deselected by the user
    *       <br><code>CALLED<code> - the event signals, that an item is 'called' by the user, this is
    *       in order activated with the cursor an pushed 'enter' key
    **/
	public ItemEvent(Widget source, int id, Object item, int type) {
		super(source);
		_id = id;
		_item = item;
		_type = type;
	}
	
    /*
    *  @return the id (key) of the affected item
    **/
	public int getId() {
		return _id;
	}
	
	/*
    *  @return the type of the event. Only possible values: <code>SELECTED</code>,<code>DESELECTED</code>,<code>CALLED</code>
    **/
	public int getType() {
		return _type;
	}
	
	/*
    *  @return the content of the affected item
    **/
	public Object getItem() {
		return _item;
	}
}
