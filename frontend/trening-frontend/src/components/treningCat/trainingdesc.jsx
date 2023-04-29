import "./traindesc.css";

const TrainingDesc = (props) => {
  const { name, description, imageSrc, typeOfTraining } = props.trendata;
  return (
    <div>
      <div className="training-desc">
        <h1>{name}</h1>
        <img src={imageSrc} alt={name} />
        <p className="description">{description}</p>
        <p className="type">{typeOfTraining}</p>
      </div>
    </div>
  );
};

export default TrainingDesc;
