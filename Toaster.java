/**
* A toaster, a box that heats food quickly and efficiently.
* @author Corinne Dixon
* @version 1.0
* @since October 15, 2018
*/
public class Toaster{

	private boolean isOn;
	private int minutesToToast, filledSlots;
	private String whatIsToasting;

	/**
	* Create a toaster with a given isOn, minutesToToast, filledSlots, and whatIsToasting.
	* @param _isOn A boolean with whether the toaster is on (true) or off (false).
	* @param _minutesToToast An int with the number of minutes the food will be toasted.
	* @param _filledSlots An int with the number of occupied slots in the toaster.
	* @param _whatIsToasting A string that contains the type of food in the toaster.
  	*/
	public Toaster(boolean _isOn, int _minutesToToast, int _filledSlots, String _whatIsToasting){
		isOn = _isOn;
		minutesToToast = _minutesToToast;
		filledSlots = _filledSlots;
		whatIsToasting = _whatIsToasting;
	}
	/**
	* Instanciate an empty toaster with a given isOn and given minutesToToast. There are 0 filled slots and "" is toasting.
	* @param _isOn A boolean with whether the toaster is on (true) or off (false).
	* @param _minutesToToast An int with the number of minutes the food will be toasted.
	*/
	public Toaster(boolean _isOn, int _minutesToToast){
		this(_isOn, _minutesToToast, 0, "")
	}

	/**
	* Toggles the toaster on or off
	*/
	public void toggleToasterOnOff(){
		isOn = !isOn;
	}

	/**
	* Sets the number of minutes to toast the food
	@param minutes An int for the number of minutes to toast the food.
	*/
	public void setTime(int minutes){
		minutesToToast = minutes;
	}

	/**
	* Sets the number of occupied slots in the toaster
	@param _filledSlots An int for the number of filled spots in the toaster.
	*/
	public void fillSlots(int _filledSlots){
		filledSlots = _filledSlots;
	}

	/**
	* Sets the type of food being toasted
	@param _whatIsToasting A string with the type of food in the toaster.
	*/
	public void describeFoodToasting(String _whatIsToasting){
		whatIsToasting = _whatIsToasting;
	}

	/**
	* Returns whether or not the toaster is on
	@return isOn A boolean that reports whether or not the toaster is on.
	*/
	public boolean isToasterOn(){
		return isOn;
	}

	/**
	* Returns how long the toaster will run for
	@return minutesToToast An int with the number of minutes the toaster will toast.
	*/
	public int minutesToasting(){
		return minutesToToast;
	}

	/**
	* Returns how many occupied slots there are
	@return filledSlots An int that will return the number of filled slots.
	*/
	public int slotsFilled(){
		return filledSlots;
	}

	/**
	* Returns the type of food that is toasting
	@return whatIsToasting A string with the type of food in the toaster.
	*/
	public String whatIsToasting(){
		return whatIsToasting;
	}
}