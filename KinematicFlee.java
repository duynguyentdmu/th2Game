package movement;

public class KinematicFlee {
	private Charater character;	
	private Charater target;	
	private double maxSpeed;	
	
	public Charater getCharacter() {
		return character;
	}
	
	public void setCharacter(Charater character) {
		this.character = character;
	}
	
	public Charater getTarget() {
		return target;
	}
	
	public void setTarget(Charater target) {
		this.target = target;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public KinematicFlee() {
		super();
	}

	public KinematicFlee(Charater character, Charater target, double maxSpeed) {
		super();
		this.character = character;
		this.target = target;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "KinematicSeek [character=" + character + ", target=" + target + ", maxSpeed=" + maxSpeed + "]";
	}

	public KinematicOutput generateKinematicOutput(){
		Vector2D velocity = new Vector2D();
		//velocity = this.target.getPosition().subVector2D(this.character.getPosition());
		velocity = this.character.getPosition().subVector2D(this.target.getPosition());
		velocity.normalize();
		velocity.mulConstant(this.maxSpeed);
		
		return new KinematicOutput(velocity, 0);
	}
	
	
}
