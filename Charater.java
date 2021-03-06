package movement;

public class Charater {
	private Vector2D position;	
	private double orientation;	
	private Vector2D velocity;	
	private double rotation;	
	
	// Getter
	// Setter
	public Vector2D getPosition() {
		return position;
	}

	public void setPosition(Vector2D position) {
		this.position = position;
	}

	public double getOrientation() {
		return orientation;
	}

	public void setOrientation(double orientation) {
		this.orientation = orientation;
	}

	public Vector2D getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector2D velocity) {
		this.velocity = velocity;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	
	public Charater() {
		super();
	}

	public Charater(Vector2D position, double orientation, Vector2D velocity, double rotation) {
		super();
		this.position = position;
		this.orientation = orientation;
		this.velocity = velocity;
		this.rotation = rotation;
	}
	
	@Override
	public String toString() {
		return "Charater [position=" + position + ", orientation=" + orientation + ", velocity=" + velocity
				+ ", rotation=" + rotation + "]";
	}

	public void update(KinematicOutput KinematicOutput, double time){
		this.velocity = KinematicOutput.getVelocity();
		this.rotation = KinematicOutput.getRotation();
		
		this.position.addVector2D(this.velocity.mulConstant(time));
		this.orientation += this.rotation*time;
	}
	

	public void applyNewOrientation(){
		if (this.velocity.getLength()>0){
			this.orientation = Math.atan2(-this.velocity.getX(), this.velocity.getZ());
		}
	}
}	
