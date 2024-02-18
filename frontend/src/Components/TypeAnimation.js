import { TypeAnimation } from 'react-type-animation';

const Animation = () => {
  return (
    <TypeAnimation
      sequence={[
        'Full Stack Developer',
        1500,
        'Web Developer',
        1500,
        'Backend Developer',
        1500
        // 'We produce food for Chinchillas',
        // 1500
      ]}
      wrapper="span"
      speed={50}
      style={{ fontSize: '2em', display: 'inline-block' }}
      repeat={Infinity}
    />
  );
};

export default Animation;
